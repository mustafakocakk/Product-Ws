#!/bin/bash
rm -rf target
curl -o swagger.json http://localhost:8090/api-docs
sed -i 's/8090/5173/g' swagger.json
mvn clean install

# package.json dosyasından sürüm numarasını al
VERSION=$(cat buildNumber)

echo $VERSION
# Sürüm numarasını parçalara ayır
MAJOR=$(echo $VERSION | cut -d '.' -f 1)
MINOR=$(echo $VERSION | cut -d '.' -f 2)
PATCH=$(echo $VERSION | cut -d '.' -f 3)

# Yama sürümünü artır
PATCH=$((PATCH+1))

# Yeni sürüm numarasını oluştur
NEW_VERSION="$MAJOR.$MINOR.$PATCH"


cd target/generated-client
npm install

# Yeni sürüm numarasını package.json dosyasına yaz
npm version $NEW_VERSION
line_number=1  # First line

npm publish
pwd
FILE="buildNumber"  # Dosya adı
echo $VERSION
echo $NEW_VERSION
cd ../../

# Use 'sed' to replace the specified line
sed -i "${line_number}s/.*/$NEW_VERSION/" "$FILE"



