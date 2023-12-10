# Microservices
Ce mini-projet vise à développer une compréhension approfondie de l'architecture micro-service.
Les axes centraux de cet apprentissage englobent la création et l'enregistrement de micro-services, la connexion à une base de données MySQL, 
l'établissement d'un micro-service Gateway, et l'implémentation d'une communication synchrone entre les micro-services en utilisant l'outil OPENFEIGN.
Dans ce mini-projet, nous adopterons une architecture basée sur les microservices, caractérisée par la décomposition d'une application en de petits services indépendants.
Au cœur de cette structure se situent les microservices clients, des entités autonomes qui interagissent pour fournir une fonctionnalité complète. 
L'API Gateway agit en tant que point d'entrée centralisé, simplifiant la gestion des requêtes en dirigeant le trafic vers les microservices appropriés. 
Le serveur de découverte Eureka revêt un rôle crucial en permettant à chaque microservice de s'enregistrer de manière dynamique, 
formant ainsi un annuaire décentralisé des services disponibles.
#### Architecture appropriée:

![archi](https://github.com/MeryemYOUSFI/microservices_TP/assets/101459843/ec2183a2-b324-4abf-ada5-d19fe56ee904)


## Étape 1 : Création du Service Discovery Eureka
Dans cette première étape, on crée un service de découverte Eureka, qui joue un rôle essentiel dans l'architecture microservices en permettant à chaque service de s'enregistrer dynamiquement, 
formant ainsi un annuaire décentralisé des services disponibles. En exécutant le projet Eureka_Server, assurez-vous d'obtenir sur le port 8761 dans votre machine la meme chose que l'image illustrative:
### Dépendances
Les dépendances qu'on doit avoir dans notre fichier de configuration:
- ✨ Eurika Server

## Illustration

<img width="959" alt="CaptureServeur" src="https://github.com/MeryemYOUSFI/microservices_TP/assets/101459843/201c836c-d590-46ea-8196-0c66ff64f629">

## Étape 2 : Création du Service Client
On mis en place un service client, intégré avec Eureka, permettant l'enregistrement et la récupération de données depuis une base de données MySQL. 
L'utilisation de Spring Boot Actuator, Eureka Discovery Client, et l'outil OpenFeign facilite la communication entre les microservices. Et donc une fois on l'execute, on voit notre service
Client s'affiche dans le tableau d'instances actuellement enregistrées auprès d'Eureka au port 8088. Les APIs existes dans notres service clients sont:
### Description brève de l'API et de ses fonctionnalités principales.
- **Chercher un client par ID**
  - **Endpoint :** `GET /client/{id}`
  - **Description :** Récupère un client en fonction de son ID.
  - **Exemple d'utilisation :** `/client/1`
- **Afficher les clients disponibles**
  - **Endpoint :** `GET /clients`
  - **Description :** Récupère les clients enregistrés.
  - **Exemple d'utilisation :** `/clients`
## Illustration

<img width="960" alt="captureClient" src="https://github.com/MeryemYOUSFI/microservices_TP/assets/101459843/1409c221-dfac-4825-826f-efd9d7ef458c">

### Dépendances
Les dépendances qu'on doit avoir dans notre fichier de configuration:
- ✨Spring Boot Actuator
- ✨Eureka Discovry Client
- ✨MySQL
-✨Spring Data JPA
- ✨OpenFeign
-✨Spring Web
- ✨Spring Boot Devtools
- ✨Lombok
  
## Étape 3 : Création d'un Service Gateway
La mise en place d'une passerelle (Gateway) offre un point d'entrée centralisé pour gérer les requêtes, simplifiant ainsi le routage du trafic vers les microservices appropriés. 
Le service gateway s'execute sur le port 8889.
### Dépendances
Les dépendances qu'on doit avoir dans notre fichier de configuration:
- ✨Spring Boot Actuator
- ✨Eureka Discovry Client
- ✨Spring Cloud Routing Gatway

## Étape 4 : Création du Service Voiture
Enfin,On ajoute un nouveau service (Service Voiture). Ce service gère les informations liées aux voitures et communique de manière synchrone avec d'autres services, notamment le service client, via l'outil OpenFeign.
Les données sont stockées dans une base de données MySQL pour assurer la cohérence entre les microservices.
### Description brève de l'API et de ses fonctionnalités principales.
- **Chercher les Voitures**
  - **Endpoint :** `GET /voitures`
  - **Description :** Récupère la liste de toutes les voitures.
  - **Exemple d'utilisation :** `/voitures`
## Illustration

<img width="960" alt="CaptureVoture" src="https://github.com/MeryemYOUSFI/microservices_TP/assets/101459843/108b6b06-1001-478b-9661-409304e1cda0">

- **Chercher les Voitures par ID**
  - **Endpoint :** `GET /voitures/{Id}`
  - **Description :** Récupère les détails d'une voiture en spécifiant son ID.
  - **Exemple d'utilisation :** `/voitures/1`
## Illustration

<img width="960" alt="voiture1" src="https://github.com/MeryemYOUSFI/microservices_TP/assets/101459843/9602e75a-a41f-4645-95bc-61d1b7cb79e0">

### Dépendances
Les dépendances qu'on doit avoir dans notre fichier de configuration:
-✨Spring Boot Actuator
-✨Eureka Discovry Client
-✨MySQL
-✨Spring Data JPA
-✨OpenFeign
-✨Spring Web
-✨Spring Boot Devtools
-✨Lombok

## Configuration du projet
- Assurez-vous de configurer correctement les propriétés de la base de données MySQL dans le fichier application.properties ou application.yml. De plus, vérifiez la configuration d'OpenFeign pour la communication entre les services.

## Build et Exécution
- Assurez-vous d'avoir les dépendances nécessaires installées et exécutez l'application en utilisant votre IDE préféré ou en utilisant Maven.


