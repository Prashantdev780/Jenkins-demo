def call(){
  def script = libraryResource('scripts/linux_command.sh')

  writeFile(
    file: 'linux_command.sh',
    text: script
  )
  sh 'chmod +x linux_command.sh'
  sh './linux_command.sh'
}
