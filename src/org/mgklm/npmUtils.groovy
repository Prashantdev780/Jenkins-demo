package org.mgklm

class npmUtils implements Serializable {
  def steps 
  npmUtils(steps) {
    this.steps = steps
  }
  def install(){
    steps.sh 'npm install'
  }
}
