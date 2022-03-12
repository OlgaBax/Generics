package ru.bainc.main.paramClass;

 class OtherPair <V> { // параметризированный класс с объектами одного типа
     private V value1 ;
     private V value2;
     public OtherPair(V value1, V value2){
         this.value1 = value1;
         this.value2 = value2;
     }
     public V getFirstValue(){
         return value1;
     }
     public V getSecondValue(){
         return value2;
     }

}
