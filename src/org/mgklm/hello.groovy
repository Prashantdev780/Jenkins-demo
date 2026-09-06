package org.mgklm

class hello implements Serializable {
String name
  
hello(String name = 'PrashantD'){ //fallback name 
  this.name = name
}
  
  
  String message(name){
    return "Hello ${name}"
  }
}
