# Item Viewer Android App
The Item Viewer Android App is a simple application that allows users to view a list of items fetched from a REST API. Users can mark items as favorites, and there are separate screens for displaying favorite items and showing detailed information about each item.

## Features
Fetch items from a REST API using Retrofit.
Display the list of items in a RecyclerView with a favorite icon to mark items as favorites.
Allow users to mark/unmark items as favorites by tapping the favorite icon.
Implement a separate screen to display only favorite items.
Show detailed information about each item on a separate screen.

## Prerequisites
Before running the application, ensure you have the following installed:
Android Studio (with Android SDK)
A working REST API with endpoints to fetch the list of items.

## Installation
Clone the repository:

git clone https://github.com/Edwinngera/Mobile-App

## Usage
1. Ensure that your REST API is running and accessible.

2. In the ApiClient.java file (app/src/main/java/com/example/itemviewer/api/ApiClient.java), replace "https://your-api-base-url.com/" with the actual base URL of your REST API.

3. Run the app on an Android emulator or physical device.

4. The main screen will display a list of items fetched from the API. Each item will have a favorite icon.

5. Tap the favorite icon to mark/unmark an item as a favorite.

6. To view favorite items only, tap the "Favorites" button at the top of the main screen. This will navigate to the favorite screen, displaying only the favorite items.

7. Tap on an item in the main screen or favorite screen to view detailed information about that item on the detail screen.
