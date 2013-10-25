<div class="category">${group?.title}
    <div class="forums">
        <g:each in="${group?.forums}" var="forum" status="idx">
            <g:render template="/helpers/forum" model="[forum: forum]" />
        </g:each>
    </div>
</div>