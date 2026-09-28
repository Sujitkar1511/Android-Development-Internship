# 👥 recycleBing - Task 4

An Android application built using **Kotlin**, **RecyclerView**, and **CardView** to render a dynamic list of Friend Requests with mutual friends count and interactive buttons.

---

## 🌟 Key Features

- **RecyclerView & CardView:** Efficient list rendering using Android's `RecyclerView` with elevated `CardView` items.
- **Custom Adapter Pattern:** Custom `FriendRequestAdapter` and `ViewHolder` implementation.
- **Data Model:** Clean Kotlin data class `FriendRequest(id, name, mutualFriends)`.
- **Interactive Controls:** Action buttons (`Confirm` and `Delete`) for each friend request item.

---

## 👥 Friend Request List Data

The list displays the following items:

| ID | Name | Mutual Friends |
| :---: | :--- | :---: |
| 1 | Sujit Kar | 4 mutual friends |
| 2 | Sneha Bez | 10 mutual friends |
| 3 | Akhmal | 6 mutual friends |
| 4 | Deepjyoti Das | 9 mutual friends |
| 5 | Kushal Jain | 14 mutual friends |
| 6 | Arindam Sahoo | 3 mutual friends |
| 7 | Raj | 5 mutual friends |
| 8 | Priya | 8 mutual friends |
| 9 | Shraya | 7 mutual friends |
| 10 | Ronit | 11 mutual friends |

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI Components:** `RecyclerView`, `CardView`, `LinearLayout`, `Button`, `TextView`
- **Architecture:** Adapter & ViewHolder Pattern

---

## 📂 Project Structure

```text
recycleBing/
├── app/
│   └── src/main/
│       ├── java/com/example/recyclebing/
│       │   ├── FriendRequest.kt        # Data model
│       │   ├── FriendRequestAdapter.kt # RecyclerView adapter & ViewHolder
│       │   └── MainActivity.kt         # Layout setup & array data binding
│       └── res/
│           └── layout/
│               ├── activity_main.xml       # Main RecyclerView layout
│               └── item_friend_request.xml # Individual card item layout
└── build.gradle.kts
```

---

## 🚀 Getting Started

1. Open Android Studio.
2. Select **Open** and choose the `recycleBing` directory.
3. Build & Run the app on emulator or physical device (`Shift + F10`).
