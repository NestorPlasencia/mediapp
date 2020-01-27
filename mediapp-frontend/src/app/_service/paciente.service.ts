import { Paciente } from './../_model/paciente';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PacienteService {

  url: string = `${environment.HOST}/pacientes`;

  constructor(private http: HttpClient) { }

  listar() {
    this.http.get<Paciente[]>(this.url);
  }
}
