# CustomRangebar

**It is similar to an enhanced SeekBar widget. It provides for the selection of a range of values.This is my first library project.**

![](https://i.imgur.com/9wo5OIM.gif)

# gradle dependency

>Add this to your module's build.gradle file:
>

**dependency**
```java
implementation 'com.github.Greymamba:Rangebar:1.2.1'
```
**Reposetory**
>Add this in your root build.gradle file (not your module build.gradle file):
>
```java
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
# Basic uses

**rangebar XML**
>To use this rangebar in your layout simply copy and paste the xml below. This provides shown rangebar to your xml and you can costomize it totally.
>

```xml
<com.example.blackmambalibrary.widgets.BlackmambaRangebar
        android:id="@+id/rangeseekbar"
        android:layout_centerInParent="true"
        android:layout_marginTop="10dp"
        app:bar_gradient_start="#fff"
        app:bar_gradient_end="#fff"
        app:bar_height="7dp"
        app:min_value="0"
        app:max_value="100"
        app:bar_color_mode="gradient"
        app:left_thumb_color="#96C1F5"
        app:right_thumb_color="#6445F5"
        app:bar_highlight_gradient_end="#6445F5"
        app:bar_highlight_gradient_start="#4B9BF8"
        app:left_thumb_color_pressed="#96C1F5"
        app:right_thumb_color_pressed="#6445F5"
        app:bar_highlight_color_mode="gradient"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="5dp"
        android:layout_marginRight="5dp" />
```
**rangebar Event Listener**

>here's the even listner for rangebar where you can find start and end value between the rangebar.
>

```java

  blackmambaRangebar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
                @Override
                public void valueChanged(Number minValue, Number maxValue) {
                 
                 //you can find min and max value here
                
                }
            });

```
# Inspiration
<br/>
This library was made by possible based on code and design inspiration from:

https://github.com/syedowaisali/crystal-range-seekbar
