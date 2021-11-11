import { CloudRequest } from './../models/cloudrequest';
import { Vm } from './../models';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ReferentialService {




    //private heroesUrl = 'api/heroes';  // URL to web api
    private vmUrl = 'http://localhost:8080/api/referential';  // URL to web api

    httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };


    constructor( private http: HttpClient) { }



      /* GET heroes whose name contains search term */
  vmTypes(): Observable<string[]> {

    return this.http.get<string[]>(`${this.vmUrl}/vmtype`).pipe(
      tap(vmTypes => vmTypes.length ?
         this.log(`found ${vmTypes.length} vmTypes `) :
         this.log(`no vmTypes found`)),
      catchError(this.handleError<string[]>('vmTypes', []))
    );
  }




      private log(message: string) {
        console.log(`VirtualMachineService: ${message}`);
      }

      private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {

          // TODO: send the error to remote logging infrastructure
          console.error(error); // log to console instead

          // TODO: better job of transforming error for user consumption
          this.log(`${operation} failed: ${error.message}`);

          // Let the app keep running by returning an empty result.
          return of(result as T);
        };
      }
}
