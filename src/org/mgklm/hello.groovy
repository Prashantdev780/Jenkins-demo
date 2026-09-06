package org.mgklm

class hello {
String name
  
hello(String name = 'PrashantD'){ //fallback name 
  this.name = name
}
  
  
  String message(name){
    return 'Hello ${name}' 
  }
}
