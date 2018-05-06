API REST - Distribuant les données du système Odoo (Connexion non disponible)

----------
----------
MÉTHODOLOGIE UTILISÉE
----------
----------

1 -Modèle en couche 
  
  Controller (Passeur)
  Service (Logique d'affaire)
  Repository  (Entités Data [BD Odoo] - Convertis en entités Model [Distribué par API REST])


***********


2 - Patron de conception Fabrique + Singleton (Dans le code : RepositoryFactory) 

Établir qu'une connexion à la base de donnée (Processus pour établir connexion couteux)
Enlever dépendance entre couches (Meilleur réutilisation, Modification)
RepositoryFactory (Responsable d'initialiser les classes d'accès aux données)



3 - Principe générale du Repository

ExtenderOdooModel <T>
  Classes abstraite - Classe mère des classes Data (Entité généré de Odoo)
  Oblige les classes de d'accès au données (enfants) à fournir les infos sur les méthodes  string GetDatabaseTableName() et T MapToModel 
  L'aspect générique permet de travailler avec les attributs de la classe et de retourner les objets typés.

RepositoryBase - Unifié les requêtes semblables 
  Classe de type générique qui attend le type ExtenderOdooModel
  Implémente l'interface IRepository aussi générique 
  
 IRepository
  Fournit un patron de méthodes génériques d'accès aux données utilisés 
  (Get, GetAll, Save, Delete, Update,...)
 
 RepositoryBase
  Implémente les méthodes de bases, évite la duplication de code semblable.
  (Ex : RepositoryFactory.account.GetAll() == RepositoryFactory.product.GetAll())
  Revient à la méthode de cette classe avec les attibut mis avec la classes ExtenderOdooModel
  
 
 
  

