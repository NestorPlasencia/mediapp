import { PacienteService } from './../../_service/paciente.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit {

  constructor(private pacienteService: PacienteService) { }

  ngOnInit() {
    this.pacienteService.listar().subscribe(data => console.log(data));
  }

}
