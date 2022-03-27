## Problem Description

- ✔️ Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe
  a generic command.
- ✔️ Implement the commands load, list, view, report (create the classes AddCommand, ListCommand, etc.).
    - ✔️ list: prints the list of items on the screen;
    - ✔️ add
    - ✔️ save
    - ✔️ load
    - ✔️ view: opens an item using the native operating system application (see the Desktop class);
    - ✔️ report: creates (and opens) an HTML report representing the content of the catalog.\
      Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
    - (+1p) Use Apache Tika in order to extract metadata from your catalog items and implement the command info in order
      to display them.
- ✔️ The application will signal invalid date or the commands that are not valid using custom exceptions.
- ✔️ The final form of the application will be an executable JAR archive. Identify the generated archive and launch the
  application from the console, using the JAR.

## Bazat pe feedback-ul precedent:

- am grupat clasele in mai multe pachete in functie de responsabilitati

## Cum am gandit problema

## Output

1. opens an item using the native operating system application (desktop = Desktop.getDesktop();)
![image](https://user-images.githubusercontent.com/61457770/160277525-59462222-882c-45d8-ac88-10692905ab2f.png)
![image](https://user-images.githubusercontent.com/61457770/160277537-5748a675-254c-437c-8fc3-eb28099712e3.png)

2. creates (and opens) an HTML report representing the content of the catalog.
![image](https://user-images.githubusercontent.com/61457770/160277580-d075d950-e4e0-4fd1-a169-113e51cdd52a.png)

3. list of items (ListCommand)
![image](https://user-images.githubusercontent.com/61457770/160277600-bb341d20-3963-43a4-9abc-ca4a5b366bfa.png)

