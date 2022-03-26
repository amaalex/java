## Problem Description

- ✔️ Create an object-oriented model of the problem. You should have at least the following classes: Catalog and Item. The items should have at least a unique identifier, a title and its location. Consider using an interface or an abstract class in order to describe the items in a catalog.
- ✔️ Implement the following methods representing commands that will manage the content of the catalog:
  - ✔️ add: adds a new entry into the catalog;
  - ✔️ toString: a textual representation of the catalog;
  - ✔️ save: saves the catalog to an external file using JSON format; you may use Jackson or other library;
  - ✔️ load: loads the catalog from an external file.

## Tinut cont pe baza feedback-ului:
  - ✨ folosit lombok
  - ✨ am vrut sa grupez clasele in mai multe pachete insa pentru compulsory sunt putine si cred ca ar fi mult mai greu de citit codul. Voi face asta pentru homework.
  - ✨ am fost atent sa nu mai fie .class-uri sau alte fisiere care n-ar trebui sa fie in repo.

## Output

Catalog importat de pe disk dupa ce initial a fost salvat pe disc.

```
Catalog{name='MyCatalog', items=[Item{name='knuth67', title='The Art of Computer Programming', location='d:/books/programming/tacp.ps'},
 Item{name='java17', title='The Java Language Specification', location='https://docs.oracle.com/javase/specs/jls/se17/html/index.html'}]}

```