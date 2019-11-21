import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;
  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
      name : 'Ford'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      name : 'BMW'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857__340.jpg',
      name : 'Aston'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name : 'Audi'
    }
  ]

  constructor() { }

  ngOnInit() {
  }

  sendCar(car){
    console.log(car);
    this.selectedCar = car;

  }

}
