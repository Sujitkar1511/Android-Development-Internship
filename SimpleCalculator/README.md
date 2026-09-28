# 🧮 Task 1: Simple Calculator App

A modern, clean Android Calculator application built with Kotlin and XML layout.

---

## 🌟 Features

- ➕ **Addition**: Calculate sum of two or more numbers.
- ➖ **Subtraction**: Calculate difference between numbers.
- ✖️ **Multiplication**: Multiply numbers efficiently.
- ➗ **Division**: Divide numbers with basic error handling (e.g. division by zero).
- 🧹 **Clear / Reset**: Easily reset inputs and start fresh calculations.
- 📱 **Responsive UI**: Designed to look clean across different screen resolutions.

---

## 🛠️ Built With

- **Language:** Kotlin
- **UI Design:** Android XML (ConstraintLayout / LinearLayout)
- **Minimum SDK:** 24 (Android 7.0)
- **Target SDK:** 34 (Android 14)
- **Build System:** Gradle (Kotlin DSL)

---

## 📁 Project Architecture

```
SimpleCalculator/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/com/example/simplecalculator/
│       │   │   └── MainActivity.kt
│       │   ├── res/
│       │   │   ├── layout/activity_main.xml
│       │   │   ├── values/
│       │   │   └── drawable/
│       │   └── AndroidManifest.xml
│       └── test/
├── build.gradle.kts
└── settings.gradle.kts
```

---

## 🚀 How to Run

1. Open Android Studio.
2. Select **Open** and choose the `SimpleCalculator` folder.
3. Sync Gradle and press **Run** (`Shift + F10`) on an emulator or Android device.
