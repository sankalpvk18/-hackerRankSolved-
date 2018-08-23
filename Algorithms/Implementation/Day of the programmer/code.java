#include<stdio.h>
int main(){
    int year;
    scanf("%d", &year);
    int dd, mm = 9;
    
    if(year == 1918){
         dd=26; 
         return printf("%02d.%02d.%d", dd, mm, year);
    }
        
    if(year>1918){
        
            if(year%4 == 0)
        {
            if( year%100 == 0)
            {
                // leap year
                if ( year%400 == 0){
                    dd=12;
                    return printf("%02d.%02d.%d", dd, mm, year);
                    //leap year
                }
                    
                else{
                    dd=13; 
                    return printf("%02d.%02d.%d", dd, mm, year);
                    //not a leap year
                }
                    
            }
            else{
                 dd=12;
                return printf("%02d.%02d.%d", dd, mm, year);
                // leap year
            }
               
        }
        if(year%4 != 0){
            dd=13;
            return printf("%02d.%02d.%d", dd, mm, year);
             // not a leap year
        }

    }
    
    if(year<1918){
        if(year%4 == 0){
            dd = 12;
            return printf("%02d.%02d.%d", dd, mm, year);
        }
        else{
            dd = 13;
            return printf("%02d.%02d.%d", dd, mm, year);
        }
    }

    
     return 0;  
}
