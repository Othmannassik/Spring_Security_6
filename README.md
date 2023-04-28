<h2>Spring Security 6 </h2>

<p>• Spring Security a une architecture conçue pour séparer l'authentification de
l'autorisation et offre des stratégies extensibles pour les deux. <br>
• Spring Security est un module de Spring qui permet de sécuriser les
applications Web. <br>
• Spring Security configure des filtres (springSecurityFilterChain) qui permet
d’intercepter les requêtes HTTP et de vérifier si l’utilisateur authentifié dispose
des droits d’accès à la ressource demandée. <br>
• Les actions du contrôleur ne seront invoquées que si l’utilisateur authentifié
dispose de l’un des rôles attribués à l’action. <br>
• Spring Security peut configurer les rôles associés aux utilisateurs en utilisant
différentes solution (inMemory, JDBC, UserDetails, etc..)</p>

<h3>- InMemory Authentication method :</h3>
<img src="Screenshots/inMemory.png" alt="">
<h4>Protection des methodes avec l'annotation "@PreAuthorize".</h4>
<img src="Screenshots/methodProtection.png" alt="">


<h3>- JDBC Authentication method :</h3>
<h4>JDBC Bean permettant la connexion avec la base de données via l'objet dataSource.</h4>
<img src="Screenshots/jdbc_Bean.png" alt="">
<h4>La Création des users avec leurs roles au démarrage de l'application via le JDBC Bean crée.</h4>
<img src="Screenshots/jdbc_usersCreation.png" alt="">
<h4>Le Fichier schema.sql contenant les requêttes permettant la création des tables users et authorities et un index sur leurs colonnes.</h4>
<img src="Screenshots/schema.png" alt="">
<h4>Pour que Spring crée les tables users et roles á partir du fichier schema.sql, il faut la préciser dans application.properties.</h4>
<img src="Screenshots/properties.png" alt="">


<h3>- UserDetails Authentication method :</h3>
<h4>L'entité User :</h4>
<img src="Screenshots/user.png" alt="">
<h4>L'entité Role :</h4>
<img src="Screenshots/role.png" alt="">

<h4>L'interface UserRepository :</h4>
<img src="Screenshots/userRepo.png" alt="">
<h4>L'interface RoleRepository :</h4>
<img src="Screenshots/roleRepo.png" alt="">

<h4>L'interface UserService :</h4>
<img src="Screenshots/userService.png" alt="">
<h4>L'implémentation de l'interface UserService :</h4>
<img src="Screenshots/userServiceImpl1.png" alt="">
<img src="Screenshots/userServiceImpl2.png" alt="">
<img src="Screenshots/userServiceImpl3.png" alt="">

<h4>La Création des users et des roles et affecter les roles au users.</h4>
<img src="Screenshots/UserDetailCreation.png" alt="">
<p>N.B: Il faut pas les recrée afin d'éviter une des exception définies dans les méthodes.</p>

<h4>L'implémentation de l'interface UserDetailsService :</h4>
<img src="Screenshots/UserDetailServiceImpl.png" alt="">
<h4>Configuration de la methode UserDetails par un objet de type UserDetailServiceImpl :</h4>
<img src="Screenshots/UserDetailConfig.png" alt="">
<h4>Il faut configurer aussi le fichier application.properties.</h4>
<img src="Screenshots/properties2.png" alt="">
