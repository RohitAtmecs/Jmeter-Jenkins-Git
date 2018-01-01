node {
  stage 'Run JMeter Test'
  C:/apache-jmeter-3.3/apache-jmeter-3.3/bin/jmeter.bat -n -t D:/PERFORMANCE/WoltersKluwer/RedirectRequest.jmx -l RedirectRequest.jtl
}

