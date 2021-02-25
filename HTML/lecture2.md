# Lecture 2

## Markup Language

- Uses tags to organise the text we want to show in a browser
- Can have metadata

## HTML

- HTML is for the contnent
- Can be linked with parts of the same file or external files
- Is a simple text file, but needs an edittor
- HTML elements need open and close tags `<tag></tag>` (example)
- Most, if not all, HTML files begin and end as such:

```HTML
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  
</body>
</html>
```

- Comments start with `<!--` and end with `-->` (can be multyline)
- Headers have the tag `<hN></hN>`, where N is between 1 and 6 (with 1 being the strongest/bigger)
- Brake line tag is `<br>` (self closing tag)
- Paragraph tag is `<p></p>`
- Horizontal rule tag is `<hr>` (self closing tag)
- Emphasis tags can be used for text, these are:
  - **Bold** text `<strong></strong>`
  - *Italic* text `<em></em>` or `<i></i>` but not recommended
  - These can be used in ***unison*** `<strong><em></em></strong>`

## CSS

- CSS is for the formating/apperance of the content
