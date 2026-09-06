job('clone-build-test-demo'){
  description('job created by dsl')

scm {
    git {
      remote{
        url('https://github.com/adrianhajdin/chat_application.git')
      }
      branch('main')
    }
}
steps {
  shell('''
    echo "build job"
    echo "repo clone"
  ''')
}
  
}

job('build-job2'){
  description('job created by dsl')

scm {
    git {
      remote{
        url('https://github.com/adrianhajdin/chat_application.git')
      }
      branch('main')
    }
}
steps {
  shell('''
    echo "build job"
    echo "repo clone"
  ''')
}
  
}


job('build-job3'){
  description('job created by dsl')

scm {
    git {
      remote{
        url('https://github.com/adrianhajdin/chat_application.git')
      }
      branch('main')
    }
}
steps {
  shell('''
    echo "build job"
    echo "repo clone"
  ''')
}
  
}


job('build-job4'){
  description('job created by dsl')

scm {
    git {
      remote{
        url('https://github.com/adrianhajdin/chat_application.git')
      }
      branch('main')
    }
}
steps {
  shell('''
    echo "build job"
    echo "repo clone"
  ''')
}
  
}
