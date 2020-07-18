lein run 

(cd things && find . -name "*.scad" | xargs -n 1 -P 8 bash -c 'openscad --autocenter -o ${1%.*}.stl $1' -)
