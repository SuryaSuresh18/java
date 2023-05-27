import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { UpdatecustomerComponent } from './updatecustomer/updatecustomer.component';

const routes: Routes = [
  {path:'customer',component:CustomerListComponent},
  {path:'create-customer',component:CreateCustomerComponent},
  {path:'update-customer/:id',component:UpdatecustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
