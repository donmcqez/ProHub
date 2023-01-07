package com.composite.dependencies

object Libraries {
    private const val socketIoVersion = "2.0.1"
    const val socketIo = "io.socket:socket.io-client:$socketIoVersion"

    private const val webrtcVersion = "1.0.32006"
    val webrtc by lazy { "org.webrtc:google-webrtc:$webrtcVersion" }

//    private const val storeVersion = "4.0.4-KT15"
    private const val storeVersion = "4.0.5"
    val store by lazy { "com.dropbox.mobile.store:store4:$storeVersion" }

    private const val tonzyCryptoVersion = "1.1.0"
    val tonzyCrypto by lazy { "com.github.tozny:java-aes-crypto:$tonzyCryptoVersion" }

    private const val airLocationVersion = "1.3"
    val airLocation by lazy { "com.github.mumayank:AirLocation:$airLocationVersion" }

    private const val threeTenVersion = "1.5.2"
    val threeTen by lazy { "org.threeten:threetenbp:$threeTenVersion:no-tzdb" }

    private const val threeTenAbpVersion = "1.3.1"
    const val threeTenAbp = "com.jakewharton.threetenabp:threetenabp:$threeTenAbpVersion"

    private const val timberVersion = "5.0.1"
    val timber by lazy { "com.jakewharton.timber:timber:$timberVersion" }

    private const val whatsAppImagePickerVersion = "1.5.3"
    val whatsAppImagePicker by lazy { "com.fxn769:pix:$whatsAppImagePickerVersion" }

    private const val balysvMaterialRippleVersion = "1.0.2"
    val balysvMaterialRipple by lazy { "com.balysv:material-ripple:$balysvMaterialRippleVersion" }

    private const val dateTimePicker = "4.2.3"
    val wdullaerMaterialDateTimePicker by lazy { "com.wdullaer:materialdatetimepicker:$dateTimePicker" }

    private const val circularImageviewVersion = "4.3.0"
    val circularImageview by lazy { "com.mikhaellopez:circularimageview:$circularImageviewVersion" }

    const val materialChipsInputVersion = "1.0.8"
    val materialChipsInput by lazy { "com.github.pchmn:MaterialChipsInput:$materialChipsInputVersion" }

    private const val nachosVersion = "1.2.0"
    val nachos by lazy { "com.hootsuite.android:nachos:$nachosVersion" }

    private const val flexboxVersion = "2.0.0"
    val flexbox by lazy { "com.google.android:flexbox:$flexboxVersion" }

    private const val crystalRangeSeekbarVersion = "1.1.3"
    val crystalRangeSeekbar by lazy { "com.crystal:crystalrangeseekbar:$crystalRangeSeekbarVersion" }

    private const val materialPreferenceVersion = "0.2.1"
    val materialPreference by lazy { "com.codevscolor.materialpreference:mp:$materialPreferenceVersion" }

    private const val nabinbhandariPermissionsVersion = "3.8"
    val nabinbhandariPermissions by lazy { "com.nabinbhandari.android:permissions:$nabinbhandariPermissionsVersion" }

    private const val snatikStorageVersion = "2.1.0"
    val snatikStorage by lazy { "com.snatik:storage:$snatikStorageVersion" }

    private const val zeloryCompressorVersion = "3.0.1"
    val zeloryCompressor by lazy { "id.zelory:compressor:$zeloryCompressorVersion" }

    private const val tapTargetViewVersion = "1.13.3"
    val tapTargetView by lazy { "com.getkeepsafe.taptargetview:taptargetview:$tapTargetViewVersion" }

    private const val hdodenhofCircleImageviewVersion = "3.1.0"
    val hdodenhofCircleImageview by lazy { "de.hdodenhof:circleimageview:$hdodenhofCircleImageviewVersion" }

    private const val alexanderLibraryVersion = "1.1.0"
    val alexanderLibrary by lazy { "com.github.jd-alexander:library:$alexanderLibraryVersion" }

    private const val ucropVersion = "2.2.6"
    val ucrop by lazy { "com.github.yalantis:ucrop:$ucropVersion" }

    private const val circularRevealVersion = "2.1.0"
    val circularReveal by lazy { "com.github.ozodrukh:CircularReveal:$circularRevealVersion" }

    private const val speedDialVersion = "3.2.0"
    val speedDial by lazy { "com.leinardi.android:speed-dial:$speedDialVersion" }

    private const val clansFabVersion = "1.6.4"
    val clansFab by lazy { "com.github.clans:fab:$clansFabVersion" }

    private const val photoEditorVersion = "0.4.0"
    val photoEditor by lazy { "ja.burhanrashid52:photoeditor:$photoEditorVersion" }

    private const val autoCompleteEditTextVersion = "0.0.6"
    val googlePlacesAutoCompleteEditText by lazy { "com.github.mukeshsolanki:com.composite.plugins.Google-Places-AutoComplete-EditText:$autoCompleteEditTextVersion" }

    private const val materialRatingbarVersion = "1.4.0"
    val materialRatingbar by lazy { "me.zhanghai.android.materialratingbar:library:$materialRatingbarVersion" }

    private const val textDrawableVersion = "1.0.1"
    val textDrawable by lazy { "com.amulyakhare:com.amulyakhare.textdrawable:$textDrawableVersion" }

    private const val roundedImageviewVersion = "2.3.0"
    val roundedImageview by lazy { "com.makeramen:roundedimageview:$roundedImageviewVersion" }

    private const val circleIndicatorVersion = "2.1.6"
    val circleIndicator by lazy { "me.relex:circleindicator:$circleIndicatorVersion" }

    private const val androidShapeImageviewVersion = "0.9.3"
    val androidShapeImageview by lazy { "com.github.siyamed:android-shape-imageview:$androidShapeImageviewVersion" }

    private const val calligraphyVersion = "2.3.0"
    val calligraphy by lazy { "uk.co.chrisjenx:calligraphy:$calligraphyVersion" }

    private const val materialStepperVersion = "4.3.1"
    val materialStepper by lazy { "com.stepstone.stepper:material-stepper:$materialStepperVersion" }

    private const val ccpVersion = "2.5.4"
    val ccp by lazy { "com.hbb20:ccp:$ccpVersion" }

    private const val easyImageVersionVersion = "3.2.0"
    val easyImage by lazy { "com.github.jkwiecien:EasyImage:$easyImageVersionVersion" }


//        val easyImage by lazy { "com.github.dhaval2404:imagepicker:2.1" }

    private const val shimmerVersion = "0.5.0"
    val shimmer by lazy { "com.facebook.shimmer:shimmer:$shimmerVersion" }

    private const val lottieVersion = "4.2.2"
    val lottie by lazy { "com.airbnb.android:lottie:$lottieVersion" }

    private const val apacheCommonsTextVersion = "1.9"
    val apacheCommonsText by lazy { "org.apache.commons:commons-text:$apacheCommonsTextVersion" }

    private const val superNovaEmojiVersion = "1.1"
    val superNovaEmoji by lazy { "com.github.hani-momanii:SuperNova-Emoji:$superNovaEmojiVersion" }

    private const val commonsIoVersion = "20030203.000550"
    val commonsIo by lazy { "commons-io:commons-io:$commonsIoVersion" }

    private const val materialScrollBarVersion = "13.4.3a"
    val materialScrollBar by lazy { "com.github.turing-tech:MaterialScrollBar:$materialScrollBarVersion" }

    private const val materialScrollBar2Version = "1.0.5"
    val materialScrollBar2 by lazy { "com.github.wynneplaga:MaterialScrollBar2:$materialScrollBar2Version" }

    private const val pinchToZoomVersion = "0.1"
    val pinchToZoom by lazy { "com.bogdwellers:pinchtozoom:$pinchToZoomVersion" }

    private const val zoomageVersion = "1.3.1"
    val zoomage by lazy { "com.jsibbold:zoomage:$zoomageVersion" }

    private const val bubbleNavigationVersion = "1.0.7"
    val bubbleNavigation by lazy { "com.gauravk.bubblenavigation:bubblenavigation:$bubbleNavigationVersion" }

    private const val loadingButtonVersion = "2.2.0"
    val loadingButton by lazy { "br.com.simplepass:loading-button-android:$loadingButtonVersion" }

    private const val autoImageSliderVersion = "1.3.2"
    val autoImageSlider by lazy { "com.github.smarteist:autoimageslider:$autoImageSliderVersion" }

    private const val stFalconImageViewerVersion = "1.0.0"
    val stFalconImageViewer by lazy { "com.github.stfalcon:stfalcon-imageviewer:$stFalconImageViewerVersion" }

    private const val photoViewVersion = "2.0.0"
    val photoView by lazy { "com.github.chrisbanes:PhotoView:$photoViewVersion" }

    private const val fullScreenImageViewVersion = "1.1.0"
    val fullScreenImageView by lazy { "com.github.tntkhang:full-screen-image-view-library:$fullScreenImageViewVersion" }

    private const val subSamplingScaleImageViewVersion = "3.10.0"
    val subSamplingScaleImageView by lazy { "com.davemorrissey.labs:subsampling-scale-image-view:$subSamplingScaleImageViewVersion" }

    private const val fastjsonVersion = "1.2.78"
    val fastJson by lazy { "com.alibaba:fastjson:$fastjsonVersion" }

    private const val flowReactiveNetworkVersion = "1.0.4"
    val flowReactiveNetwork by lazy { "ru.beryukhov:flowreactivenetwork:$flowReactiveNetworkVersion" }

    private const val swipeButtonVersion = "0.4.0"
    val swipeButton by lazy { "com.ebanx:swipe-button:$swipeButtonVersion" }

    private const val swipeAbleButtonVersion = "0.1.0"
    val swipeAbleButton by lazy { "com.github.stfalcon:swipeable-button:$swipeAbleButtonVersion" }

    private const val draggableViewVersion = "1.0.0"
    val draggableView by lazy { "com.github.hyuwah:DraggableView:$draggableViewVersion" }

    private const val theFuntastyVersion = "3.1.0"
    val theFunTasty by lazy { "com.thefuntasty.hauler:core:$theFuntastyVersion" }

    private const val androidImagePopupVersion = "1.2.2"
    val androidImagePopup by lazy { "com.github.chathuralakmal:AndroidImagePopup:$androidImagePopupVersion" }

    private const val loupeVersion = "1.2.1"
    val loupe by lazy { "com.igreenwood.loupe:loupe:$loupeVersion" }

    private const val loupeExtensionVersion = "1.0.0"
    val loupeExtension by lazy { "com.igreenwood.loupe:extensions:$loupeExtensionVersion" }

    private const val scaleAndSwipeDismissImageViewVersion = "v0.7"
    val scaleAndSwipeDismissImageView by lazy { "com.github.Toxa2033:ScaleAndSwipeDismissImageView:$scaleAndSwipeDismissImageViewVersion" }

    private const val motionToastVersion = "1.3.3.4"
    val motionToast by lazy { "com.github.Spikeysanju:MotionToast:$motionToastVersion" }

    private const val collapsingToolbarSubtitleVersion = "1.1.0"
    val collapsingToolbarSubtitle by lazy { "com.hendraanggrian.material:collapsingtoolbarlayout-subtitle:$collapsingToolbarSubtitleVersion" }


    //        val materialDialog by lazy { "io.github.vanpra.compose-material-dialogs:color:0.6.3" }

    private const val materialDialogVersion = "0.8.1-rc"
    val materialDialogCore by lazy { "io.github.vanpra.compose-material-dialogs:core:$materialDialogVersion" }
    val materialDialogColor by lazy { "io.github.vanpra.compose-material-dialogs:color:$materialDialogVersion" }
    val materialDialogDateTime by lazy { "io.github.vanpra.compose-material-dialogs:datetime:$materialDialogVersion" }


    private const val epoxyVersion = "4.5.0"

    /**
     * https://github.com/airbnb/epoxy
     */
    const val epoxy: String = "com.airbnb.android:epoxy:$epoxyVersion"


    private const val epoxyProcessorVersion = "4.5.0"

    /**
     * https://github.com/airbnb/epoxy
     */
    val epoxy_processor by lazy { "com.airbnb.android:epoxy-processor:$epoxyProcessorVersion" }

    private const val landsCapist = "1.6.1"
    const val landscapistGlide = "com.github.skydoves:landscapist-glide:$landsCapist"

    private const val sealedxVersion = "1.0.0"
    const val sealedxCore = "com.github.skydoves:sealedx-core:$sealedxVersion"
    const val sealedxProcessor = "com.github.skydoves:sealedx-processor:$sealedxVersion"

    private const val barricadeVersion = "0.0.3"
    const val barricade = "com.mutualmobile:barricade2:$barricadeVersion"
    const val barricadeAnnotation = "com.mutualmobile:barricade-annotations:$barricadeVersion"
    const val barricadeCompiler = "com.mutualmobile:barricade-compiler:$barricadeVersion"
}
