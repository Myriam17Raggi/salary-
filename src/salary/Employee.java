package salary;
 /*Creare un programma che gestisce gli importi di un'aziensa
 Ogni impiegato ha nome, cognome, numero di anni di servizio e salario base.
Aggiungere un costruttore con tutti i parametri
Aggiungere un metodo per calcolare e restituire il salario effettivo dell’impiegato,
sapendo che sul salario base scatta un aumento del 5% ogni 5 anni di servizio
In una classe Main chiedere all’utente di inserire i dati dell’impiegato e mostrare a
 quanto ammonta il suo salario attuale
  */
public class Employee {

 // CAMPI
  String firstName;
  String lastName;
  int years;
  double baseSalary;


// COSTRUTTORI

  Emoloyee(String firstName, String lastName, int years, double baseSalary){
   this.firstName = firstName;
   this.lastName = lastName;
   this.years = years;
   this.baseSalary = baseSalary;
  }

//METODI

  double getActualSalary(){
   //sul salario scatta un aumento del 5% ogni 5 anni di servizio
   //variabile per il salario attuale
   double actualSalary = baseSalary;
   //ciclo sugli anni per incrementarlo
   for (int i = 5; i < years; i+5){
    double percentage = baseSalary/100*5;
    actualSalary += percentage;
   }
   //restituisco il salario attuale
   return actualSalary;
  }
}
