# calendar

An Android app which displays a
[`CalendarView`](https://developer.android.com/reference/android/widget/CalendarView).
It only displays a calendar. There is no integration with the calendar provider
API.

## Features

- Requires no permissions
- Small app (< 16 KB)
- No third-party runtime dependencies

## Build

Run the following command from the root of the repository to make a debug
build:

```shell
./gradlew assembleDebug
```

Making a release build is similar, but requires environment variables to be set
to indicate how to sign the APK:

```shell
CAL_STORE_FILE='...' CAL_STORE_PASSWORD='...' CAL_KEY_ALIAS='...' CAL_KEY_PASSWORD='...' ./gradlew assembleRelease
```

## License

[MIT](LICENSE)
