import { Component,OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit{
  customer: Customer = new Customer();
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  constructor(private customerService: CustomerService,
    private router: Router){}
    onSubmit(){
      console.log(this.customer);
      this.customerService.createCustomer(this.customer).subscribe(data=>{console.log(data)});
    }
}
