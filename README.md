# Spring-boot-elk-kibana-logstash
Setup ELK Stack for Spring Boot | Kibana & Logstash
# Commencer par télécharger:
```bash
  Elasticsearch
  Kibana
  Logstash
  Lien -> https://www.elastic.co/fr/downloads/
  Extraire les ressources dans un dossier
```

## Créer un repertoire work/logs 
```bash
  A l'intérieur, créer un fichier application.log
  Pour l'affichage des logs
```

```bash
  Pour Elasticsearch, on peut l'exécuter  avec le fichier elasticsearch/bin/elasticsearch.bat
  .\elasticsearch.bat -> sur la console du shell
  Il est ouvert sur le port 127.0.0.1:9200
```
```bash
  Pour Kibana, on peut l'exécuter avec le fichier kibana.bin/kibana.bat
  .\kibana.bat
  Il est ouvert sur le port 127.0.0.1:5601
```

```bash
  Pour Logstash
  +- Créer un nouveau fichier logstash.conf dans le repertoire logstash/config
  dans lequel on aura:
```
```bash
input{
	file {
		path => "C:/m2gl/kibana/spring-elk-kibana-logstash.log"
		start_position => "beginning"
	}
  }
  
  output{
	stdout{
		codec => rubydebug
	}
	elasticsearch{
		hosts => ["localhost:9200"]
		
	}
  }
```
```bash
  On peut exécuter logstash en exécutant logstash/bin/logstash.bat -f ..\config\logstash.conf
  logstash est exécuté sur le port 9600
```

# Ressource
```bash
  https://howtodoinjava.com/log4j2/log4j2-xml-configuration-example/  
  https://github.com/Java-Techie-jt/elk-stack-logging-example/tree/master/src/main
```
# NB
```bash
  Pour la connexion à élastichsearch, 
  j'ai mis à false les connexion ssl sur elasticsearch\config\elasticsearch.yml
  & pour Kibana, décommenter la ligne  elasticsearch.hosts: ["http://localhost:9200"] sur kibana\config\kibana.yml
```

