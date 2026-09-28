# 🎓 CollegeWebViewApp - Task 2

An Android WebView application designed to load and navigate the official **Panskura Banamali College** portal seamlessly.

---

## 🌟 Key Features

- **Embedded WebView Integration:** Loads web pages inside the app without opening an external browser.
- **In-App Navigation:** Overrides default URL loading to keep browsing within the app.
- **Back Key Navigation:** Handles hardware back button presses to navigate back through web browsing history.
- **Custom Header Bar:** Displays an attractive header with badge tags and action buttons.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **Component:** `android.webkit.WebView`, `WebViewClient`
- **Permissions:** `android.permission.INTERNET`, `android.permission.ACCESS_NETWORK_STATE`
- **UI Styling:** Material Design, Custom Vector Drawables & Badges

---

## 📂 Project Structure

```text
CollegeWebViewApp/
├── app/
│   └── src/main/
│       ├── java/com/example/mywebapp/
│       │   └── MainActivity.kt       # WebView setup & back navigation logic
│       └── res/
│           ├── layout/
│           │   └── activity_main.xml # WebView and Header layout
│           └── drawable/             # Gradient backgrounds & badge styling
└── build.gradle.kts
```

---

## 🚀 Getting Started

1. Open Android Studio.
2. Select **Open** and navigate to the `CollegeWebViewApp` directory.
3. Ensure active internet connection on emulator/device.
4. Build & Run the app (`Shift + F10`).
