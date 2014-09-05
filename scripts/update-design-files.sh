#!/bin/bash
rm -r ./fonts/*
cp -r ./design/v1/fonts/* ./fonts/

rm -r ./css/*
cp -r ./design/v1/css/*.css ./css/

cp ./design/v1/js/bootstrap.min.js ./js/
