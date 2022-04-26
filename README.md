[![JitPack](https://img.shields.io/jitpack/v/github/developersancho/FragmentNavigation.svg?style=for-the-badge)](https://jitpack.io/#adrielcafe/kaptain)
[![Android API](https://img.shields.io/badge/api-23%2B-yellowgreen.svg?style=for-the-badge)](https://android-arsenal.com/api?level=14)
[![Kotlin](https://img.shields.io/github/languages/top/developersancho/FragmentNavigation.svg?style=for-the-badge&color=orange)](https://kotlinlang.org/)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg?style=for-the-badge)](https://ktlint.github.io/)
[![License MIT](https://img.shields.io/github/license/developersancho/FragmentNavigation.svg?style=for-the-badge&color=yellow)](https://opensource.org/licenses/MIT)

# FragmentNavigation

FragmentNavigation is a small, dependencyless and easy to use Android library that helps you to
navigate between fragments spread over several modules.

## Import to your project

1. Add the JitPack repository in your root build.gradle or settings.gradle at the end of
   repositories:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Or

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Current
version: [![JitPack](https://jitpack.io/v/developersancho/FragmentNavigation.svg?style=flat-square)](https://jitpack.io/#developersancho/FragmentNavigation)

2. Next, add the library to your module:

```gradle
dependencies {
    implementation "com.github.developersancho:FragmentNavigation:$currentVersion"
}
```

# 💻 Usage

## Example

#### Add FragmentContainerView to Your Activity Layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.fragment.app.FragmentContainerView
    xmlns:android="http://schemas.android.com/apk/res/android" android:id="@+id/nav_container"
    android:layout_width="match_parent" android:layout_height="match_parent" />
```

#### Configure Your Activity

```kotlin
class MainActivity : AppCompatActivity() {
    private var backPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigateFragment(HomeFragment.newInstance(), clearBackStack = true)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            super.onBackPressed()
        } else {
            if (backPressedOnce) {
                finish()
                return
            }
            backPressedOnce = true
            Toast.makeText(this, getString(R.string.app_exit_label), Toast.LENGTH_SHORT).show()
            lifecycleScope.launch {
                delay(2000)
                backPressedOnce = false
            }
        }
    }
}
```

#### Navigate Your Fragment

```kotlin
navigateFragment(
    fragment = NotificationFragment.newInstance(),
    animation = AnimationType.DEFAULT
)
```

## 🤝 Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire,
and create. Any contributions you make are **greatly appreciated**.

1. Open an issue first to discuss what you would like to change.
2. Fork the Project
3. Create your feature branch (`git checkout -b feature/amazing-feature`)
4. Commit your changes (`git commit -m 'Add some amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a pull request

Please make sure to update tests as appropriate.

## ✍️ Authors

<a href="https://www.linkedin.com/in/mesut-g-33b41030" target="_blank">
  <img src="https://avatars.githubusercontent.com/u/30066734?v=4" width="70" align="left">
</a>

👤 **developersancho**

[![Linkedin](https://img.shields.io/badge/-linkedin-0077B5?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/mesut-g-33b41030/)
[![Medium](https://img.shields.io/badge/-medium-12100E?style=for-the-badge&logo=medium)](https://developersancho.medium.com/)

Feel free to ping me 😉

## License

```license
Copyright © 2022 - developersancho

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
