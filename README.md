
# Rapport

Med hjälp av biblioteket picasso så laddas bilden från en url om den pekar på en bild. Skulle url vara felaktig så kommer en error icon att visas istället.

Kodstycket är hur bilden laddas in när man trycker på knappen. URL hämtas då från inputfältet och laddas sedan in med hjälp av picasso till
imageviewn. Skulle något bli fel så laddas istället en error icon in.
```
btn.setOnClickListener(View -> {
    String url = input.getText().toString();

    if (!url.isEmpty())
        Picasso.get().load(url).error(R.drawable.ic_error).into(img);
});
```

![](2.png)
![](3.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
