# Android Layout Transitions in Kotlin
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/gayankuruppu/android-layout-transitions-kotlin.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/gayankuruppu/android-layout-transitions-kotlin/context:java)
[![Build Status](https://travis-ci.org/gayankuruppu/android-layout-transitions-kotlin.svg?branch=master)](https://travis-ci.org/gayankuruppu/android-layout-transitions-kotlin)
[![Total alerts](https://img.shields.io/lgtm/alerts/g/gayankuruppu/android-layout-transitions-kotlin.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/gayankuruppu/android-layout-transitions-kotlin/alerts/)
[![](https://jitpack.io/v/gayankuruppu/android-layout-transitions-kotlin.svg)](https://jitpack.io/#gayankuruppu/android-layout-transitions-kotlin)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/gayankuruppu/android-layout-transitions-kotlin)

<img width="360" alt="Android Layout Transitions in Kotlin" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/0-app-animations.1a0c93af.gif">

## Get

### Gradle

1. Add this to `build.gradle` of `project` gradle dependency

```groovy
allprojects {
	repositories {
		...
 		maven { url 'https://jitpack.io' }
	}
}
```

2. Add this to `build.gradle` of `app` gradle dependency

```groovy
dependencies {
	implementation 'com.github.gayankuruppu:android-layout-transitions-kotlin:1.0.1'
}
```

### Or

### Maven

1. Add this to `build.gradle` of `project` gradle dependency

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
	    	<url>https://jitpack.io</url>
	</repository>
</repositories>
```

2. Add this to `build.gradle` of `module` gradle dependency

```xml
<dependency>
	<groupId>com.github.gayankuruppu</groupId>
	<artifactId>android-layout-transitions-kotlin</artifactId>
	<version>1.0.1</version>
</dependency>
```
## Usage
### Import render animations
#### Kotlin
```kotlin
import render.animations.*
```

#### Java
```java
import render.animations.*;
```

### Start animation
#### Kotlin
```kotlin
// declare TextView
val intent = Intent(this, LoadActivity::class.java)
val buttonView: Button = findViewById(R.id.buttonView)

// go to view
buttonView.setOnClickListener {

	// start intent
	startActivity(intent)
	
	// set transition
	val transitions = Transitions(this@MainActivity)
	transitions.setAnimation(Slide().InRight())
	
}
```

#### Java
```java
// declare variables
Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
Button buttonView = (Button) findViewById(R.id.buttonView);

// go to view
buttonView.setOnClickListener( new OnClickListener() {
	@Override
	public void onClick(View v) {
	
		// start intent
		startActivity(intent);

		// set transition
		Transitions transitions = Transitions(MainActivity.this);
		transitions.setAnimation(Slide().InRight());
		
	}
});	
```

## Transitions

To animate the layout, create Transitions class and set the method name and specific transition method name to `setAnimation` method.
The following classes are the transitions support by the library

| Class Name  |             |             |             |             |
| ----------- | ----------- | ----------- | ----------- | ----------- |
| `Slide`      | `Fade`     |  `Flip`     | `Rotate`    | `Zoom`      |

### Slide
| `Slide`           |                    |  		      |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InLeft`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/9-slide-in-left.f24d3999.gif">| `InRight`              |<img width="200" alt="Slide In Right" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/10-slide-in-right.d01700f5.gif">|
| `InUp`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/8-slide-in-down.3f151b67.gif">| `InDown`              |<img width="200" alt="Slide In Right" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/11-slide-in-up.c849a670.gif">|

### Fade
| `Fade`           |                    |  		      |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InLeft`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/3-fade-in-left.6bb32f18.gif">| `InRight`              |<img width="200" alt="Slide In Right" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/4-fade-in-right.fb8cef3c.gif">|
| `InUp`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/2-fade-in-down.a3df9411.gif">| `InDown`              |<img width="200" alt="Slide In Right" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/5-fade-ip-up.88f31455.gif">|
| `In`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/1-fade-in.ca83c538.gif">|    |     |


### Flip
| `Flip`            |                    |
| ----------------- | ----------------- |
| `InLeft`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/6-flip-in-x.257f5c0b.gif">|

### Rotate
| `Flip`            |                    |
| ----------------- | ----------------- |
| `InLeft`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/7-rotate-in.83eef598.gif">|

### Zoom
| `Flip`            |                    |
| ----------------- | ----------------- |
| `InLeft`|<img width="200" alt="Slide In Left" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/12-zoom-in.674069ad.gif">|

## Develop the library

1. Select `Git` from `Check out project from Version Control` in your Android Studio
2. Paste the repository url and click `Clone` button
3. Click `Yes` to open the repository
4. `Build` using the latest `Gradle` version

Go to https://github.com/gayankuruppu/android-vpn-client-ics-openvpn#develop see the steps
