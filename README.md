[![JitPack](https://img.shields.io/jitpack/v/github/developersancho/FragmentNavigation.svg?style=for-the-badge)](https://jitpack.io/#adrielcafe/kaptain)
[![Android API](https://img.shields.io/badge/api-23%2B-yellowgreen.svg?style=for-the-badge)](https://android-arsenal.com/api?level=14)
[![Kotlin](https://img.shields.io/github/languages/top/developersancho/FragmentNavigation.svg?style=for-the-badge&color=orange)](https://kotlinlang.org/)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg?style=for-the-badge)](https://ktlint.github.io/)
[![License MIT](https://img.shields.io/github/license/developersancho/FragmentNavigation.svg?style=for-the-badge&color=yellow)](https://opensource.org/licenses/MIT)

# FragmentNavigation
FragmentNavigation is a small, dependencyless and easy to use Android library that helps you to navigate between fragments spread over several modules.

## Import to your project
1. Add the JitPack repository in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
Current version: [![JitPack](https://jitpack.io/v/developersancho/FragmentNavigation.svg?style=flat-square)](https://jitpack.io/#developersancho/FragmentNavigation)

2. Next, add the library to your module:
```gradle
dependencies {
    implementation "com.github.developersancho:FragmentNavigation:$currentVersion"
}
```