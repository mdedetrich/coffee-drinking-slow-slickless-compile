name := "coffee-drinking-slow-slickless-compile"

scalaVersion := "2.11.8"

resolvers += "Underscore Bintray" at "https://dl.bintray.com/underscoreio/libraries"

val slickVersion = "3.1.1"
val slickPgVersion = "0.14.2"

libraryDependencies ++= Seq(
  "com.typesafe.slick"   %% "slick" % slickVersion,
  "com.github.tminglei"  %% "slick-pg"              % slickPgVersion,
  "com.github.tminglei"  %% "slick-pg_core"         % slickPgVersion,
  "com.github.tminglei"  %% "slick-pg_date2"        % slickPgVersion,
  "com.github.tminglei"  %% "slick-pg_play-json"    % slickPgVersion,
  "org.postgresql"       %  "postgresql"            % "9.4-1201-jdbc41" force(),
  "com.chuusai"          %% "shapeless" % "2.3.1",
  "io.underscore"        %% "slickless" % "0.2.1"
)
