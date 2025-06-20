export concurrently_colors := "blue,green,yellow,magenta,cyan,white"

help:
    just --list

dev:
    concurrently \
    --names "squint,vite" \
    --prefix-colors ${concurrently_colors} \
        "npx squint watch" \
        "npx vite"

setup:
    npm clean-install
