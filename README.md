# TP 14 : Conteneurisation avec Docker

## Description
Ce projet Spring Boot est configuré pour être déployé dans un conteneur Docker avec une base de données MySQL.

## Prérequis
- Java 17
- Maven 3.6+
- Docker
- Docker Compose

## Étapes d'exécution

### 1. Compiler le projet
```bash
mvn clean package
```

### 2. Construire l'image Docker
```bash
docker build -t ens/springdocker:1.0 .
```

### 3. Exécuter avec Docker Compose
```bash
docker-compose up -d
```

### 4. Vérifier les logs
```bash
docker-compose logs -f
```

### 5. Accéder à l'application et aux interfaces graphiques
- **Application Spring Boot** : http://localhost:8080
  - Endpoint principal : http://localhost:8080/
  - Health check : http://localhost:8080/health
  - API Users : http://localhost:8080/users
- **phpMyAdmin** (Interface graphique MySQL) : http://localhost:8081
  - Serveur : `mysql-db`
  - Utilisateur : `root`
  - Mot de passe : `1234`
- **Portainer** (Interface graphique Docker) : http://localhost:9000
  - Créer un compte admin au premier accès
- **MySQL** : localhost:3306

### 6. Vérifier les conteneurs
```bash
docker ps
docker-compose logs spring-app
docker-compose logs mysql-db
```

### 7. Arrêter l'environnement
```bash
docker-compose down
```

### 8. Arrêter et supprimer les volumes (supprime les données MySQL)
```bash
docker-compose down -v
```

## Structure du projet
- `src/main/java/ma/ens/springdocker/` : Code source de l'application
- `src/main/resources/application.properties` : Configuration de l'application
- `Dockerfile` : Configuration pour construire l'image Docker
- `docker-compose.yml` : Configuration pour orchestrer les conteneurs

