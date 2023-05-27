import { Component,OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-updatecustomer',
  templateUrl: './updatecustomer.component.html',
  styleUrls: ['./updatecustomer.component.css']
})
export class UpdatecustomerComponent implements OnInit {
  id!:number;
  customer :Customer = new Customer();
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.customerService.getCustomerById(this.id).subscribe(data=>{
      this.customer=data;
    }, error=> console.log(error));
  }
  constructor(private customerService: CustomerService,
    private route: ActivatedRoute,
    private router:Router){}
    onSubmit(){
      this.customerService.updateCustomer(this.id,this.customer).subscribe(data=>{
        this.goToCustomerList();
      }
      ,error => console.log(error));
    }
    goToCustomerList(){
      this.router.navigate(['/customers']);
    }

}
