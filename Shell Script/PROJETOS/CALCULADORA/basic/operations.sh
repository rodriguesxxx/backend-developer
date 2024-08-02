#!/usr/bin/env bash

sum() {
    local  x=$1
    local y=$2
    return $(($x + $y))
}