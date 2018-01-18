FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD  target/product-api-1.0.0.jar product-api.jar
EXPOSE 8070
ENTRYPOINT ["java","-jar","/product-api.jar"]
