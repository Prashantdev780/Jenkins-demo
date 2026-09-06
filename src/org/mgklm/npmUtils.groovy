package org.mgklm

class npmUtils implements Serializable {
  def steps 
  npmUtils(steps) {
    this.steps = steps
  }
  def cloneRepo(String url, String branch){
    steps.git(
      url: url,
      branch: branch
    )
  }
  def install(){
    steps.sh 'npm install'
  }
}
