Pack Your Bag is an Android app to use when you're on a trip.
It is a mobile organizer in which you can write down all the things you need for a trip, 
as well as mark which ones you have already packed and which ones you haven't.
1. Project Manifest
This is the AndroidManifest.xml file that describes the configuration and components of an Android application.
Application
allowBackup: Specifies whether the application can participate in the backup and restore infrastructure.
dataExtractionRules: References an XML file that contains rules for extracting data from the application.
fullBackupContent: References an XML file that specifies the backup rules for the application.
icon: Specifies the launcher icon for the application.
label: Specifies the label or name of the application.
supportsRtl: Indicates whether the application supports right-to-left (RTL) layouts.
theme: Specifies the theme applied to the application.
tools:targetApi: Specifies the target API level for the application.
Activities
CheckList: Represents an activity named "CheckList" in the application. It is not exported, meaning it cannot be accessed by components outside the application.
MainActivity: Represents the main activity of the application. It is exported, allowing other components to access it.
intent-filter: Defines an intent filter for the main activity.
action: Specifies the "android.intent.action.MAIN" action for the activity, indicating that it is the main entry point of the application.
category: Specifies the "android.intent.category.LAUNCHER" category for the activity, indicating that it should be displayed as a launcher icon in the device's app launcher.
 2. PackYourBackProject Adapter
This is an Android RecyclerView adapter called "Adapter" that is used to display a list of items with titles and images. It is designed to work with the PackYourBackProject application.
Usage
To use this adapter, follow these steps:
Create an instance of the Adapter class, providing the necessary parameters:
context: The context of the application or activity.
titles: A list of strings representing the titles of the items.
images: A list of integers representing the resource IDs of the images for the items.
activity: The activity instance where the adapter is being used.
Set the adapter to a RecyclerView by calling setAdapter method and passing the instance of the Adapter class.
Implement the necessary layout file for each item. The layout file used in this adapter is main_item.xml, which includes a title (TextView), an image (ImageView), and a container (LinearLayout).
Implement the logic for item click events inside the onBindViewHolder method of the adapter:
Set the title and image for the current item.
Set a click listener for the container (linearLayout) of the item.
Inside the click listener, create an intent to navigate to the CheckList activity.
Pass additional data (MyConstants.HEADER_SMALL and MyConstants.SHOW_SMALL) through the intent using putExtra method.
Dependencies
The following dependencies are required for this adapter to work:
The RecyclerView support library.
Compatibility
This adapter is compatible with Android devices running API level 1 and higher.
Note
Ensure that the necessary resources, such as R.layout.main_item, R.id.title, R.id.img, and R.id.linearLayout, are properly implemented in the project.
 3. PackYourBackProject CheckListAdapter
This is an Android RecyclerView adapter called "CheckListAdapter" that is used to display a checklist of items. It is designed to work with the PackYourBackProject application.

Usage
To use this adapter, follow these steps:

Create an instance of the CheckListAdapter class, providing the necessary parameters:

context: The context of the application or activity.
itemsList: A list of Items objects representing the checklist items.
database: An instance of the Room database (RoomDB) used to store the checklist items.
show: A string indicating whether to show or hide certain UI elements based on the context.
Set the adapter to a RecyclerView by calling the setAdapter method and passing the instance of the CheckListAdapter class.

Implement the necessary layout file for each item. The layout file used in this adapter is check_list_item.xml, which includes a checkbox (CheckBox), a delete button (Button), and a container (LinearLayout).

Implement the logic for item click events inside the onBindViewHolder method of the adapter:

Set the text and checked state of the checkbox based on the item data.
Customize the UI based on the show parameter and the checked state of the item.
Set click listeners for the checkbox and delete button.
Inside the checkbox click listener, update the checked state of the item in the database and handle UI updates and toast messages accordingly.
Inside the delete button click listener, display a confirmation dialog to delete the item from the database and remove it from the list.
Dependencies
The following dependencies are required for this adapter to work:
The RecyclerView support library.
The AlertDialog class for displaying the delete confirmation dialog.
Compatibility
This adapter is compatible with Android devices running API level 1 and higher.
Note
Ensure that the necessary resources, such as R.layout.check_list_item, R.id.linearLayout, R.id.checkbox, and R.id.btnDelete, are properly implemented in the project.
4.PackYourBackProject CheckListAdapter
This is an Android RecyclerView adapter called "CheckListAdapter" that is used to display a checklist of items. It is designed to work with the PackYourBackProject application.

Usage
To use this adapter, follow these steps:

Create an instance of the CheckListAdapter class, providing the necessary parameters:

context: The context of the application or activity.
itemsList: A list of Items objects representing the checklist items.
database: An instance of the Room database (RoomDB) used to store the checklist items.
show: A string indicating whether to show or hide certain UI elements based on the context.
Set the adapter to a RecyclerView by calling the setAdapter method and passing the instance of the CheckListAdapter class.

Implement the necessary layout file for each item. The layout file used in this adapter is check_list_item.xml, which includes a checkbox (CheckBox), a delete button (Button), and a container (LinearLayout).

Implement the logic for item click events inside the onBindViewHolder method of the adapter:

Set the text and checked state of the checkbox based on the item data.
Customize the UI based on the show parameter and the checked state of the item.
Set click listeners for the checkbox and delete button.
Inside the checkbox click listener, update the checked state of the item in the database and handle UI updates and toast messages accordingly.
Inside the delete button click listener, display a confirmation dialog to delete the item from the database and remove it from the list.
Dependencies
The following dependencies are required for this adapter to work:
The RecyclerView support library.
The AlertDialog class for displaying the delete confirmation dialog.
Compatibility
This adapter is compatible with Android devices running API level 1 and higher.
Note
Ensure that the necessary resources, such as R.layout.check_list_item, R.id.linearLayout, R.id.checkbox, and R.id.btnDelete, are properly implemented in the project.
5. PackYourBackProject Constants
This class, MyConstants, contains constant values used in the PackYourBackProject application.

Constants
The following constants are defined in the MyConstants class:

MY_SELECTIONS: Represents the label "My Selections".

TRUE_STRING: Represents the string value "true".

FALSE_STRING: Represents the string value "false".

HEADER_SMALL: Represents the header value for a small header.

SHOW_SMALL: Represents the show value for a small view.

USER_SMALL: Represents the user value for a small view.

SYSTEM_SMALL: Represents the system value for a small view.

BASIC_NEEDS_CAMEL_CASE: Represents the label "Basic Needs" in camel case.

CLOTHING_CAMEL_CASE: Represents the label "Clothing" in camel case.

PERSONAL_CARE_CAMEL_CASE: Represents the label "Personal Care" in camel case.

BABY_NEEDS_CAMEL_CASE: Represents the label "Baby Needs" in camel case.

HEALTH_CAMEL_CASE: Represents the label "Health" in camel case.

TECHNOLOGY_CAMEL_CASE: Represents the label "Technology" in camel case.

FOOD_CAMEL_CASE: Represents the label "Food" in camel case.

BEACH_SUPPLIES_CAMEL_CASE: Represents the label "Beach Supplies" in camel case.

CAR_SUPPLIES_CAMEL_CASE: Represents the label "Car Supplies" in camel case.

NEEDS_CAMEL_CASE: Represents the label "Needs" in camel case.

MY_LIST_CAMEL_CASE: Represents the label "My List" in camel case.

MY_SELECTIONS_CAMEL_CASE: Represents the label "My Selections" in camel case.

FIRST_TIME_CAMEL_CASE: Represents the label "firstTime" in camel case.

Usage
To use these constants, simply refer to them by their respective names in your code. They can be accessed using the MyConstants class, like MyConstants.MY_SELECTIONS or MyConstants.TRUE_STRING.

These constants are typically used to represent fixed values, such as labels, keys, or flags, throughout the application. By defining them as constants, it makes it easier to maintain and update these values in one central location.
6. PackYourBackProject DAO (Data Access Object)
This ItemsDao interface defines the database operations related to the Items table in the PackYourBackProject application.

Methods
The following methods are defined in the ItemsDao interface:

saveItem(Items items): Saves an item to the database. If the item already exists, it will be replaced.

getAll(String category): Retrieves all items from the database based on the specified category. The items are ordered by their IDs in ascending order.

delete(Items items): Deletes an item from the database.

checkUncheck(int id, boolean checked): Updates the checked status of an item with the specified ID.

getItemsCount(): Retrieves the total number of items in the database.

deleteAllSystemItems(String addedBy): Deletes all items added by the specified user from the database.

deleteAllByCategory(String category): Deletes all items from the database that belong to the specified category.

deleteAllByCategoryAndAddedBy(String category, String addedBy): Deletes all items from the database that belong to the specified category and were added by the specified user.

getAllSelected(Boolean checked): Retrieves all items from the database based on their checked status. The items are ordered by their IDs in ascending order.

Usage
To use the ItemsDao interface, you need to have a Room database set up in your project. Once you have the database instance, you can obtain an instance of the ItemsDao using the itemsDao() method of the database object.

You can then call the defined methods on the ItemsDao instance to perform database operations such as saving items, retrieving items based on category or checked status, updating item properties, or deleting items from the database.

The annotations such as @Dao, @Insert, @Query, and @Delete are provided by the Room library and help define the database operations and mappings between the database table and the Items model.

Compatibility
This code is compatible with projects that use the Room library for database operations in Android applications.
7.PackYourBackProject Data
The AppData class in the com.example.packyourbackproject.Data package is responsible for managing the application data and providing various methods to retrieve and persist the data.

Methods
The following methods are defined in the AppData class:

getBasicData(): Retrieves a list of basic needs items.

getPersonalCareData(): Retrieves a list of personal care items.

getClothingData(): Retrieves a list of clothing items.

getBabyNeedsData(): Retrieves a list of baby needs items.

getHealthData(): Retrieves a list of health-related items.

getTechnologyData(): Retrieves a list of technology items.

getFoodData(): Retrieves a list of food items.

getBeachSuppliesData(): Retrieves a list of beach supplies items.

getCarSuppliesData(): Retrieves a list of car supplies items.

getNeedsData(): Retrieves a list of general needs items.

prepareItemsList(String category, String[] data): Helper method to prepare a list of Items objects based on the given category and an array of item names.

getAllData(): Retrieves a list of lists, where each inner list represents a category and contains the corresponding items.

persistAllData(): Persists all the data in the database by saving each item using the saveItem() method of the ItemsDao instance obtained from the RoomDB database.

persistDataByCategory(String category, Boolean onlyDelete): Persists or deletes the data for a specific category. If onlyDelete is true, it only deletes the items from the specified category.

deleteAndGetListByCategory(String category, Boolean onlyDelete): Deletes the items from the specified category and returns a new list of items based on the category.

Usage
The AppData class can be used to retrieve and persist the application data. It requires an instance of the RoomDB database and, optionally, a Context object.

To retrieve the data, you can call the corresponding methods like getBasicData(), getPersonalCareData(), etc. These methods return a list of Items objects representing the items in the respective category.

To persist the data, you can use the persistAllData() method to save all the items in the database. Alternatively, you can use the persistDataByCategory(String category, Boolean onlyDelete) method to save or delete the items for a specific category.
8. PackYourBackProject Database
The RoomDB class in the com.example.packyourbackproject.Database package is responsible for managing the Room database used in the application.

Database Configuration
The RoomDB class is annotated with @Database to indicate that it represents a Room database. It has the following configuration:

entities = Items.class: Specifies the entity classes that will be associated with this database. In this case, it's the Items class.

version = 1: Specifies the version number of the database. This can be incremented whenever there are changes to the database schema.

exportSchema = false: Disables the export of the schema as a separate file.

Methods
The following methods are defined in the RoomDB class:

getInstance(Context context): Returns an instance of the RoomDB database. This method follows the singleton pattern to ensure that only one instance of the database is created. It takes a Context object as a parameter.

mainDao(): Returns the DAO (Data Access Object) interface for accessing and manipulating the Items table in the database. This method is required by Room to provide the necessary DAO implementation.

Usage
To use the RoomDB database in your application, you can call the getInstance(Context context) method to obtain an instance of the database. This method ensures that only one instance of the database is created throughout the application.

Once you have the database instance, you can use the mainDao() method to obtain the DAO interface. The DAO interface provides methods for performing database operations such as inserting, querying, updating, and deleting records.
9. PackYourBackProject Models
The Items class in the com.example.packyourbackproject.Models package represents an item entity in the application. It is used to define the structure of items stored in the database.

Entity Configuration
The Items class is annotated with @Entity to indicate that it represents an entity in the Room database. It has the following configuration:

tableName = "items": Specifies the name of the table in the database where the items will be stored.
Fields
The Items class has the following fields:

ID: An auto-generated primary key field for uniquely identifying each item.

itemName: Represents the name of the item.

category: Represents the category to which the item belongs.

addedby: Represents the source or origin of the item (e.g., "system" for system-generated items).

checked: Indicates whether the item is checked or not.

Constructors and Methods
The Items class provides several constructors and getter/setter methods for accessing and modifying the field values.

Constructors: The class provides multiple constructors to initialize the Items objects with different combinations of field values.

Getter/Setter Methods: These methods allow you to retrieve and modify the values of the fields in the Items objects.

Serialization
The Items class implements the Serializable interface, allowing instances of this class to be serialized and deserialized. This can be useful when passing Items objects between components or storing them in a persistent storage.
10. PackYourBackProject CheckList Activity
The CheckList class in the com.example.packyourbackproject package represents the main activity for managing a checklist of items. It provides functionality for adding, searching, and manipulating items in the checklist.

Activity Layout
The activity layout is defined in the activity_check_list.xml file. It includes a RecyclerView for displaying the checklist items, an input EditText for adding new items, and a button (btnAdd) to add items to the checklist.

Initialization and Setup
The onCreate() method initializes the activity, sets the content view, and retrieves the intent extras to determine the header and show values for the checklist.

The onCreateOptionsMenu() method inflates the menu layout (menu_one.xml) and configures the visibility of menu items based on the header and show values.

Menu Handling
The onOptionsItemSelected() method handles the selection of menu items. It uses intents and startActivityForResult() to navigate to different activities and perform actions based on the selected menu item.
Checklist Handling
The updateRecycler() method configures the RecyclerView with a CheckListAdapter to display the checklist items. It also sets up the layout manager for the RecyclerView.

The addNewItem() method is invoked when the "Add" button (btnAdd) is clicked. It retrieves the item name from the input EditText, creates a new Items object with the necessary data, and adds it to the database using RoomDB. It then updates the RecyclerView to reflect the changes.

Database Access
The RoomDB instance is obtained using RoomDB.getInstance(this). It allows access to the database and provides methods for saving and retrieving items.

The database.mainDao() method returns the ItemsDao interface, which defines the database operations for the Items entity.

Search Functionality
The onCreatePanelMenu() method handles the search functionality. It inflates the menu layout (menu_one.xml) and configures the SearchView to filter the checklist items based on the entered search query.
Other Methods
The onActivityResult() method is invoked when returning from another activity, in this case, the "MySelections" activity. It updates the checklist items in the RecyclerView based on the changes made in the other activity.

The onSupportNavigateUp() method handles the navigation when the back button in the action bar is pressed.
11. PackYourBackProject MainActivity
The MainActivity class in the com.example.packyourbackproject package represents the main activity of the PackYourBackProject application. It serves as the entry point of the application and provides a grid of options for the user to select.

Activity Layout
The activity layout is defined in the activity_main.xml file, which is inflated using the ActivityMainBinding class. It includes a RecyclerView (binding.recyclerView) to display the options in a grid format.

Initialization and Setup
The onCreate() method initializes the activity, sets the content view, and hides the action bar. It initializes the titles list with the titles of the options and the images list with the corresponding images.

The Adapter class is used to populate the RecyclerView with the options. An instance of the adapter (adapter) is created, and a GridLayoutManager is set on the RecyclerView to display the items in a grid layout.

Handling Back Press
The onBackPressed() method is overridden to implement a double tap back button behavior. If the back button is tapped within a certain time interval (2000 milliseconds), the application will be exited. Otherwise, a toast message will be displayed to prompt the user to tap the back button again.
App Data Persistence
The persistAppData() method is responsible for persisting application data using SharedPreferences. It retrieves an instance of SharedPreferences and an editor to modify the preferences.

The AppData class is used to manage the persistence of application data. If it is the first time the application is launched (MyConstants.FIRST_TIME_CAMEL_CASE preference is false), all the data is persisted using the persistAllData() method. The AppData.LAST_VERSION preference is set to AppData.NEW_VERSION after data persistence. If it is not the first time but the version has changed, the system items are deleted, and the data is persisted again.

Other Methods
The addAddTitles() method initializes the titles list with the titles of the options available in the application.

The addAllImages() method initializes the images list with the corresponding images for each option.
12. 
