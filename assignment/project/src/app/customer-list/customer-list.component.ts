import { Component,OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit{
  customer!:Customer[];
  ngOnInit(): void {
    this.getCustomers();
  }
  constructor(private customerService:CustomerService){}
    private getCustomers(){
      this.customerService.getCustomerList().subscribe((data=>{this.customer=data;}));
    }
}

