#!/bin/bash

curl -o swagger.json http://localhost:8090/api-docs
sed -i 's/8090/5173/g' swagger.json
npx openapi-generator-cli generate -i swagger.json  -g javascript -o outputDir


# package.json dosyasından sürüm numarasını al
VERSION=$(node -p "require('./buildNumber.json').version")

echo $VERSION
# Sürüm numarasını parçalara ayır
MAJOR=$(echo $VERSION | cut -d '.' -f 1)
MINOR=$(echo $VERSION | cut -d '.' -f 2)
PATCH=$(echo $VERSION | cut -d '.' -f 3)

# Yama sürümünü artır
PATCH=$((PATCH+1))

# Yeni sürüm numarasını oluştur
NEW_VERSION="$MAJOR.$MINOR.$PATCH"


cd outputDir
npm install
npm run build

# Yeni sürüm numarasını package.json dosyasına yaz
npm version $NEW_VERSION

npm publish --force
pwd
cd ../
FILE="buildNumber.json"  # Dosya adı
echo $VERSION
echo $NEW_VERSION
sed -i "s/\"version\": \"$VERSION\"/\"version\": \"$NEW_VERSION\"/g" "$FILE"
