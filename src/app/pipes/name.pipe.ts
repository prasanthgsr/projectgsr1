import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'name'
})
export class NamePipe implements PipeTransform {

  transform(usersList: any, searchText: any) {  
           if (searchText)  
   	            return usersList.filter(x => 
		 x.firstName.toLowerCase()
		 .startsWith(searchText.toLowerCase()));  
   	              
   	        return usersList;  
   	    }  
    

}
