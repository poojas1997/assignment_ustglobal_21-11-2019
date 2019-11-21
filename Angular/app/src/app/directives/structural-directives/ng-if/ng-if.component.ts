import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  templateUrl: './ng-if.component.html',
  styleUrls: ['./ng-if.component.css']
})
export class NgIfComponent implements OnInit {


  ShowOrHide : boolean = false;
  constructor() { 
    setTimeout( () => {
      this.ShowOrHide = true;
    },2000);
  }

  ngOnInit() {
  
  }

}
