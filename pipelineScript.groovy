node {
   ws('C:\\apache-jmeter-3.3\\apache-jmeter-3.3\\extras') {
       stage 'Run JMeter Test with Apache Ant'
       def antHome = tool 'ant'
       bat "pushd C:\\apache-jmeter-3.3\\apache-jmeter-3.3\\extras && ${antHome}\\bin\\ant -f build.xml"
       step ([$class: 'ArtifactArchiver', artifacts: 'Test.html', fingerprint: true])
   }
}

