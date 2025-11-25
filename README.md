# TP 14 : Conteneurisation avec Docker

## Description
Ce projet Spring Boot est configuré pour être déployé dans un conteneur Docker avec une base de données MySQL.



## Structure du projet

<img width="547" height="601" alt="Capture d’écran 2025-11-25 à 19 44 35" src="https://github.com/user-attachments/assets/cec97a29-5e2f-407b-9e69-7cd878a16fd5" />


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
 <img width="1206" height="748" alt="Capture d’écran 2025-11-25 à 19 29 43" src="https://github.com/user-attachments/assets/1dbc738b-9912-47cd-a53a-3e9072401c25" />

    
  - Health check : http://localhost:8080/health
 
    <img width="1206" height="748" alt="Capture d’écran 2025-11-25 à 19 30 22" src="https://github.com/user-attachments/assets/0eff3fed-2563-4af2-a605-41165ae8e405" />

  - API Users : http://localhost:8080/users
  
    <img width="1206" height="748" alt="Capture d’écran 2025-11-25 à 19 30 37" src="https://github.com/user-attachments/assets/90419a54-b234-4c5f-858a-123988aa5a32" />

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



