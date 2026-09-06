def call(string url , String branch){
    git branch: ${branch}
        url: ${url}
    }