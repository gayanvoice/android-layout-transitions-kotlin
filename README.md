# Android Layout Transitions in Kotlin
[![Build Status](https://travis-ci.org/gayankuruppu/android-layout-transitions-kotlin.svg?branch=master)](https://travis-ci.org/gayankuruppu/android-layout-transitions-kotlin)
[![](https://jitpack.io/v/gayankuruppu/android-layout-transitions-kotlin.svg)](https://jitpack.io/#gayankuruppu/android-layout-transitions-kotlin)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/gayankuruppu/android-layout-transitions-kotlin)

<img width="360" alt="Android Layout Transitions in Kotlin" src="https://gayankuruppu.github.io/android-layout-transitions-kotlin/static/media/0-app-animations.1a0c93af.gif">

## Get

### Gradle

1. Add this to `build.gradle` of project gradle dependency

```groovy
allprojects {
	repositories {
		...
 		maven { url 'https://jitpack.io' }
	}
}
```

2. Add this to `build.gradle` of app gradle dependency

```groovy
dependencies {
	implementation 'com.github.gayankuruppu:android-layout-transitions-kotlin:1.0.0'
}
```

### Or

### Maven

1. Add this to `build.gradle` of project gradle dependency

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
	    	<url>https://jitpack.io</url>
	</repository>
</repositories>
```

2. Add this to `build.gradle` of module gradle dependency

```xml
<dependency>
	<groupId>com.github.gayankuruppu</groupId>
	<artifactId>android-layout-transitions-kotlin</artifactId>
	<version>1.0.0</version>
</dependency>
```
## Usage
### Import render animations

```kotlin
// kotlin
import render.animations.*

// java
import render.animations.*;
```

### Start animation

```kotlin
// kotlin

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

// java

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
