# Coffee Drinking Slow Slickless Compile

This is test case showing a problem with Shapeless and Slick (although it could just be shapless)
where if you have accidentally have an incorrect mapping, the scala compiler takes a really
long amount of time to report an error (taking at least 5 minutes).

This may be an issue more with the Scala compiler in regards to doing its type inference to
try and satisfy the Generic mapping

Note that this an issue with Shapeless combined with Slick (when using slickless). You can test
this by simply using `???` as a return value in the `override def *` and check the
construction of the `HList` by itself without using `<>`